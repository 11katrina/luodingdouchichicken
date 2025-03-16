package com.service.impl;

import org.springframework.stereotype.Service;

import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import com.dao.ChuchanpinCollectionDao;
import com.entity.NongchanpinCollectionEntity;
import com.service.NongchanpinCollectionService;
import com.entity.view.NongchanpinCollectionView;

/**
 * 畜产品收藏 服务实现类
 */
@Service("nongchanpinCollectionService")
@Transactional
public class NongchanpinCollectionServiceImpl extends ServiceImpl<ChuchanpinCollectionDao, NongchanpinCollectionEntity> implements NongchanpinCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<NongchanpinCollectionView> page =new Query<NongchanpinCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
