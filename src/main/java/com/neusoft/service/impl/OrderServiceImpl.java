package com.neusoft.service.impl;

import com.neusoft.converter.OrderMaster2OrderDTOConverter;
import com.neusoft.dataobject.OrderMaster;
import com.neusoft.dto.OrderDTO;
import com.neusoft.repository.OrderDetailRepository;
import com.neusoft.repository.OrderMasterRepository;
import com.neusoft.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/6/21 15:56
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {



    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        Page<OrderMaster> orderMasterPage = orderMasterRepository.findByBuyerOpenid(buyerOpenid, pageable);

        List<OrderDTO> orderDTOList = OrderMaster2OrderDTOConverter.convert(orderMasterPage.getContent());

        return new PageImpl<OrderDTO>(orderDTOList, pageable, orderMasterPage.getTotalElements());
    }


    @Override
    public Page<OrderDTO> findList(Pageable pageable) {
        Page<OrderMaster> orderMasterPage = orderMasterRepository.findAll(pageable);

        List<OrderDTO> orderDTOList = OrderMaster2OrderDTOConverter.convert(orderMasterPage.getContent());

        return new PageImpl<>(orderDTOList, pageable, orderMasterPage.getTotalElements());
    }
}
