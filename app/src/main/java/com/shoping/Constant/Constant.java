package com.shoping.Constant;

import com.shoping.luxerush.R;

/**
 * Created by appslure on 05-02-2016.
 */
public class Constant {

    public static  String STREMAILADDREGEX="^[_A-Za-z0-9]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,4})$"; //EMAIL REGEX
    public static String PREFS_NAME="MyPrefsFile";

    public static String GOOGLE_PROJ_ID="351850919678";

    /*-------------sp files----------------------*/
    public static String SP_LOGIN_ID="login";
    public static String SP_GCM_ID="gcm";
    public static String SP_DEVICE_ID="device";

    public static String SP_PRODUCT_LIST="list";
    public static String SP_FILTER_BRAND="brand";
    public static String SP_FILTER_SIZE="size";
    public static String SP_FILTER_CATEGORY="category";
    public static String SP_FILTER_MIN="min";
    public static String SP_FILTER_MAX="max";
    public static String SP_FILTER_BANNER="banner";
    public static String SP_PROMO_ID="promo_id";
    public static String SP_CART_ITEM="cart";
    public static String SP_ORDER_BUY="buy";
    public static String SP_ORDER_RENT="rent";
    public static String SP_ORDER_SUBSCRIPTION="subscription";

    public static String SP_PRODUCT_ALL="all";
    public static String SP_PRODUCT_BAG="bag";
    public static String SP_PRODUCT_CLOTH="cloth";


    public static String NAME="Sign in";

    public static String WS_HTTP="Http";
    public static String WS_DOMAIN_NAME="appslure.in";
    public static String WS_PATH="/luxerush/webservices/";

    public static String WS_RESPONSE_SUCCESS="success";
    public static String WS_RESPONSE_FAILURE="failure";

    public static String TITLES_LOGIN[] = {"Home","Track Order","Rate this App","Help","Signout"};

    public static int ICONS[] = {R.drawable.ic_side_home,R.drawable.ic_side_track,R.drawable.ic_side_rate,R.drawable.ic_side_help,R.drawable.ic_side_signout};


    /* -----------web services-------------------*/

    public static String WS_SIGNUP="signup.php";
    public static String WS_SIGNUP_social="social_signup.php";
    public static String WS_SIGNIN="login.php";
    public static String WS_HELP="help.php";
    public static String WS_SIGNIN_SOCIAL="social_login.php";
    public static String WS_ITEM_LIST="product_list.php";
    public static String WS_ITEM_DETAIL="product_detail.php";
    public static String WS_ADD_WISHLIST="wishlist.php";
    public static String WS_GET_WISHLIST="wishlist_list.php";
    public static String WS_GET_USER_DETAIL="user_detail.php";
    public static String WS_SUBSCRIPTION_PACKAGE="packages.php";
    public static String WS_SUBSCRIPTION_DETAIL="packages_detail.php";
    public static String WS_VALIDATE_PROMO="promo_check.php";
    public static String WS_ORDER_RENT="rent_order.php";
    public static String WS_ORDER_BUY="order.php";
    public static String WS_TAKE_SUBSCRIPTION="user_subscribe.php";
    public static String WS_SUBSCRIPTION_LIST="subscribe_product.php";
    public static String WS_SUBSCRIPTION_LIST_DETAIL="subscribe_product_detail.php";
    public static String WS_TAKE_SUBSCRIPTION_PRODUCT="subscribe_rent_order.php";
    public static String WS_FILTER="filter.php";
    public static String WS_UPDATE_PROFILE="profile_updated.php";
    public static String WS_CHANGE_PASSWORD="change_password.php";
    public static String WS_ORDER_HISTORY="order_history.php";
    public static String WS_BRAND_ALL="product_brands.php";
    public static String WS_Get_Slots="slot.php";


    /* -----------------------TAG SELECTED----------------------*/

    public static String TAG_ALL="all";
    public static String TAG_BUY="all";
    public static String TAG_PRELOVED="preloved";
    public static String TAG_NEW="new";
    public static String TAG_RENT="all";
    public static String TAG_SUBSCRIPTION="subscription";
    public static String TAG_ALA_CARTE="ala_carte";


    /*---------------------CATEGORY---------------------------*/


    /*---------------------Ala CARTE iTEM kEY*/

    public static String KEY_Id="id";
    public static String KEY_Image="image";
    public static String KEY_Name="name";
    public static String KEY_Size="size";
    public static String KEY_Discount="discount";
    public static String KEY_WishList="wishlist";

    public static String CATEGORY_ALL="all";
    public static String CATEGORY_BUY="buy";
    public static String CATEGORY_RENT="rent";

     /* Items List variables*/

    public static String productID[];
    public static String productName[];
    public static String productImage[];
    public static String productOriginalPrice[];
    public static String productDiscountedPrice[];
    public static String productTag[];
    public static String productWishlist[];
    public static String productKeyword[];


    /* Banner */

    public static String bannerID[];
    public static String bannerImage[];
    public static String bannerType[];
    public static String bannerCategory[];

    /* Related Items List variables*/

    public static String productIDRelated[];
    public static String productNameRelated[];
    public static String productImageRelated[];
    public static String productOriginalPriceRelated[];
    public static String productDiscountedPriceRelated[];
    public static String productTagRelated[];
    public static String productWishlistRelated[];
    public static String productKeywordRelated[];

    /* Wishlist Items List variables*/

    public static String productIDWish[];
    public static String productNameWish[];
    public static String productImageWish[];
    public static String productOriginalPriceWish[];
    public static String productDiscountedPriceWish[];
    public static String productTagWish[];
    public static String productWishlistWish[];
    public static String productKeywordWish[];


    public static String productDetailImages[];

    public static String SubscriptionDetailImages[];


    /* subscription package list*/

    public static String packageID[];
    public static String packageName[];
    public static String packagePrice[];
    public static String packageBags[];
    public static String packageClothes[];

    /* subscription detail brands*/

    public static String brandImage[];
    public static String brandName[];


     /* SUBSCRIPTION Items List variables*/

    public static String productIDSubs[];
    public static String productNameSubs[];
    public static String productImageSubs[];
    public static String productDiscountedPriceSubs[];

      /* ORDER HISTORY BUY*/

    public static String buyOrderID[];
    public static String buyOrderDate[];
    public static String buyOrderStatus[];
    public static String buyOrderPaymentType[];
    public static String buyOrderPrice[];
    public static String buyOrderDeliverydate[];
    public static String buyOrderName[];
    public static String buyOrderImage[];
    public static String buyOrderAddress[];

    /* ORDER HISTORY SUBSCRIPTION */

    public static String subscriptionOrderID[];
    public static String subscriptionOrderDate[];
    public static String subscriptionOrderStatus[];
    public static String subscriptionOrderPrice[];
    public static String subscriptionOrderName[];
    public static String subscriptionOrderImage[];


    /* ORDER HISTORY RENT*/

    public static String rentOrderID[];
    public static String rentOrderDate[];
    public static String rentOrderStatus[];
    public static String rentOrderPaymentType[];
    public static String rentOrderPrice[];
    public static String rentOrderDeliverydate[];
    public static String rentOrderAddress[];
    public static String rentOrderProducts[];


    /* Rent product */

    public static String rentProductName[];
    public static String rentProductImage[];
    public static String rentProductPrice[];
    public static String rentProductStart[];
    public static String rentProductEnd[];
    public static String rentProductCondition[];
    public static String rentProductReturned[];


    /* */

    public static String allBrandID[];
    public static String allBrandName[];
    public static String allBrandImage[];



}
