package com.xue.service.Impl;

import com.xue.dao.ProductionMapper;
import com.xue.dao.UserDetailMapper;
import com.xue.exception.MyException;
import com.xue.pojo.po.Production;
import com.xue.pojo.po.UserDetail;
import com.xue.pojo.vo.ProductionShow;
import com.xue.service.ProductionService;
import com.xue.utils.AddressTransferUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductionServiceImpl implements ProductionService {

    @Autowired
    ProductionMapper productionMapper;
    @Autowired
    UserDetailMapper userDetailMapper;

    @Override
    public List<ProductionShow> selectProductionByTag(String tag) throws MyException {
        List<Production> productions = productionMapper.fuzzyQueryByTagList(tag);
        if (productions.size()==0){
            throw  new MyException("该分类下没有作品！！");
        }
        List<ProductionShow>  productionShows=new ArrayList<>();
        for (int i = 0; i < productions.size(); i++) {
            ProductionShow productionShow = new ProductionShow();
            UserDetail userDetail = userDetailMapper.selectByPrimaryKey(productions.get(i).getAccount());
            productionShow.setCameraArea(productions.get(i).getCameraArea());
            productionShow.setExplain(productions.get(i).getExplain());
            productionShow.setId(productions.get(i).getId());
            productionShow.setImglist(AddressTransferUtil.addressTrans(productions.get(i).getImglist()));
            productionShow.setLaunchTime(productions.get(i).getLaunchTime());
            productionShow.setNickName(userDetail.getNickName());
            productionShows.add(productionShow);
        }
        return productionShows;
    }
}
