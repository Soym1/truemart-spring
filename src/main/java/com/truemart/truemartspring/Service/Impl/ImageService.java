package com.truemart.truemartspring.Service.Impl;

import com.truemart.truemartspring.Repository.ImageRepository;
import com.truemart.truemartspring.Service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService implements IImageService {
    @Autowired
    ImageRepository imageRepository;
}
