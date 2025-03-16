package com.service.impl;

import org.springframework.stereotype.Service;

import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import com.dao.ChuchanpinCommentbackDao;
import com.entity.NongchanpinCommentbackEntity;
import com.service.NongchanpinCommentbackService;
import com.entity.view.NongchanpinCommentbackView;

/**
 * 畜产品评价 服务实现类
 */
@Service("nongchanpinCommentbackService")
@Transactional
public class NongchanpinCommentbackServiceImpl extends ServiceImpl<ChuchanpinCommentbackDao, NongchanpinCommentbackEntity> implements NongchanpinCommentbackService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<NongchanpinCommentbackView> page =new Query<NongchanpinCommentbackView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
