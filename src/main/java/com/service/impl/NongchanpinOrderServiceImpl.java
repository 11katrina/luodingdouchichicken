package com.service.impl;

import org.springframework.stereotype.Service;

import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import com.dao.ChuchanpinOrderDao;
import com.entity.NongchanpinOrderEntity;
import com.service.NongchanpinOrderService;
import com.entity.view.NongchanpinOrderView;

/**
 * 畜产品订单 服务实现类
 */
@Service("nongchanpinOrderService")
@Transactional
public class NongchanpinOrderServiceImpl extends ServiceImpl<ChuchanpinOrderDao, NongchanpinOrderEntity> implements NongchanpinOrderService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<NongchanpinOrderView> page =new Query<NongchanpinOrderView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
