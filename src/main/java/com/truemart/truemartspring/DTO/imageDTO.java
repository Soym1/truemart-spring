package com.truemart.truemartspring.DTO;

public class imageDTO {
    private String imageName;
    private String imageType;
    private String imageContext;

    public imageDTO() {
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getImageContext() {
        return imageContext;
    }

    public void setImageContext(String imageContext) {
        this.imageContext = imageContext;
    }


    @Override
    public String toString() {
        return "imageDTO{" +
                "imageName='" + imageName + '\'' +
                ", imageType='" + imageType + '\'' +
                ", imageContext='" + imageContext + '\'' +
                '}';
    }
}
