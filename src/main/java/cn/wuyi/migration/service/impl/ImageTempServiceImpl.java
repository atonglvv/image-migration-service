package cn.wuyi.migration.service.impl;


import cn.wuyi.migration.mapper.ImageTempMapper;
import cn.wuyi.migration.pojo.entity.ImageTemp;
import cn.wuyi.migration.service.ImageTempService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: leek
 * @description: 图片迁移临时服务
 * @author: atong
 * @create: 2020-12-18 11:30
 */
@Service("imageTempServiceImpl")
public class ImageTempServiceImpl implements ImageTempService {

    @Resource
    ImageTempMapper imageTempMapper;


    @Override
    public ImageTemp getImageTempByPrimaryKey(Integer id) {
        ImageTemp imageTemp = imageTempMapper.selectByPrimaryKey(id);
        return imageTemp;
    }

    @Override
    public Integer insertImageTemp(ImageTemp imageTemp) {
        int insert = imageTempMapper.insert(imageTemp);
        return insert;
    }
}