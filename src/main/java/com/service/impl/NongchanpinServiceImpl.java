package com.service.impl;

import org.springframework.stereotype.Service;

import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import com.dao.ChuchanpinDao;
import com.entity.NongchanpinEntity;
import com.service.NongchanpinService;
import com.entity.view.NongchanpinView;

/**
 * 畜产品 服务实现类
 */
@Service("nongchanpinService")
@Transactional
public class NongchanpinServiceImpl extends ServiceImpl<ChuchanpinDao, NongchanpinEntity> implements NongchanpinService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<NongchanpinView> page =new Query<NongchanpinView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
