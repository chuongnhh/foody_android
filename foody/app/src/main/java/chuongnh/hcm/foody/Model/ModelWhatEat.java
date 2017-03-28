package chuongnh.hcm.foody.Model;

/**
 * Created by Nguyen Hoang Chuong on 3/28/2017.
 */

public class ModelWhatEat {

    public String FoodImage;
    public String FoodName;
    public String ShopName;
    public String Address;

    public String UserImage;
    public String UserComment;
    public String CommentContent;

    public ModelWhatEat(String foodImage, String foodName, String shopName,
                        String address, String userImage, String userComment, String commentContent) {
        FoodImage = foodImage;
        FoodName = foodName;
        ShopName = shopName;
        Address = address;
        UserImage = userImage;
        UserComment = userComment;
        CommentContent = commentContent;
    }

    public ModelWhatEat() {

    }

    public String getFoodImage() {
        return FoodImage;
    }

    public void setFoodImage(String foodImage) {
        FoodImage = foodImage;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getUserImage() {
        return UserImage;
    }

    public void setUserImage(String userImage) {
        UserImage = userImage;
    }

    public String getUserComment() {
        return UserComment;
    }

    public void setUserComment(String userComment) {
        UserComment = userComment;
    }

    public String getCommentContent() {
        return CommentContent;
    }

    public void setCommentContent(String commentContent) {
        CommentContent = commentContent;
    }

}
