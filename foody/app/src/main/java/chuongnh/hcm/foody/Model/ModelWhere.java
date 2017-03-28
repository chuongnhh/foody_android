package chuongnh.hcm.foody.Model;

/**
 * Created by Nguyen Hoang Chuong on 3/28/2017.
 */

public class ModelWhere {
    public ModelWhere(String shopName, String shopAddress, String shopRate, String shopKm, String shopImage,
                      String userImage1, String userComment1, String commentContent1, String userRate1,
                      String userImage2, String userComment2, String commentContent2, String userRate2) {
        ShopName = shopName;
        ShopAddress = shopAddress;
        ShopRate = shopRate;
        ShopKm = shopKm;
        ShopImage = shopImage;
        UserImage1 = userImage1;
        UserComment1 = userComment1;
        CommentContent1 = commentContent1;
        UserRate1 = userRate1;
        UserImage2 = userImage2;
        UserComment2 = userComment2;
        CommentContent2 = commentContent2;
        UserRate2 = userRate2;
    }

    public ModelWhere(String shopName, String shopAddress, String shopRate, String shopKm, String shopImage,
                      String userImage1, String userComment1, String commentContent1, String userRate1) {
        ShopName = shopName;
        ShopAddress = shopAddress;
        ShopRate = shopRate;
        ShopKm = shopKm;
        ShopImage = shopImage;
        UserImage1 = userImage1;
        UserComment1 = userComment1;
        CommentContent1 = commentContent1;
        UserRate1 = userRate1;
    }

    public ModelWhere(String shopName, String shopAddress, String shopRate, String shopKm, String shopImage) {
        ShopName = shopName;
        ShopAddress = shopAddress;
        ShopRate = shopRate;
        ShopKm = shopKm;
        ShopImage = shopImage;
    }

    public String ShopName;
    public String ShopAddress;
    public String ShopRate;
    public String ShopKm;
    public String ShopImage;

    public String UserImage1;
    public String UserComment1;
    public String CommentContent1;
    public String UserRate1;

    public String UserImage2;
    public String UserComment2;
    public String CommentContent2;
    public String UserRate2;

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public String getShopAddress() {
        return ShopAddress;
    }

    public void setShopAddress(String shopAddress) {
        ShopAddress = shopAddress;
    }

    public String getShopRate() {
        return ShopRate;
    }

    public void setShopRate(String shopRate) {
        ShopRate = shopRate;
    }

    public String getShopKm() {
        return ShopKm;
    }

    public void setShopKm(String shopKm) {
        ShopKm = shopKm;
    }

    public String getShopImage() {
        return ShopImage;
    }

    public void setShopImage(String shopImage) {
        ShopImage = shopImage;
    }

    public String getUserImage1() {
        return UserImage1;
    }

    public void setUserImage1(String userImage1) {
        UserImage1 = userImage1;
    }

    public String getUserComment1() {
        return UserComment1;
    }

    public void setUserComment1(String userComment1) {
        UserComment1 = userComment1;
    }

    public String getCommentContent1() {
        return CommentContent1;
    }

    public void setCommentContent1(String commentContent1) {
        CommentContent1 = commentContent1;
    }

    public String getUserRate1() {
        return UserRate1;
    }

    public void setUserRate1(String userRate1) {
        UserRate1 = userRate1;
    }

    public String getUserImage2() {
        return UserImage2;
    }

    public void setUserImage2(String userImage2) {
        UserImage2 = userImage2;
    }

    public String getUserComment2() {
        return UserComment2;
    }

    public void setUserComment2(String userComment2) {
        UserComment2 = userComment2;
    }

    public String getCommentContent2() {
        return CommentContent2;
    }

    public void setCommentContent2(String commentContent2) {
        CommentContent2 = commentContent2;
    }

    public String getUserRate2() {
        return UserRate2;
    }

    public void setUserRate2(String userRate2) {
        UserRate2 = userRate2;
    }
}
