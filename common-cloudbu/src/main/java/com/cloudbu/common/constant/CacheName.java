package com.cloudbu.common.constant;

/**
 * @author lixiaodong
 * 缓存前缀常量
 */
public class CacheName {
    /**
     * 后台管理用户登录key
     */
    public static final String CACHE_KEY_USER_TOKEN = "TOKEN:USER:";
    /**
     * B端用户登录key
     */
    public static final String STORE_USER_INFO_TOKEN = "TOKEN:STORE:";
    /**
     * C端用户登录key
     */
    public static final String CUSTOMER_USER_INFO_TOKEN = "TOKEN:CUSTOMER:";
    /**
     * 订单门店提货码锁KEY
     */
    public static final String CACHE_KEY_STORE_PICK_UP_CODE_GENERATE = "CACHE:KEY:STORE:PICK:UP:CODE:GENERATE:";
    /**
     * 订单门店提货码队列KEY
     */
    public static final String CACHE_KEY_STORE_PICK_UP_CODE_QUEUE = "CACHE:KEY:STORE:PICK:UP:CODE:QUEUE:";
    /**
     * 订单修改锁KEY 全局唯一，订单修改统一用这个
     */
    public static final String CACHE_KEY_MODIFY_ORDER = "CACHE:KEY:MODIFY:ORDER:";
    /**
     * 门店当日订单汇总信息KEY
     */
    public static final String CACHE_KEY_STORE_ORDER_INTRADAY_SALESSUMMARY = "STORE:SALESSUMMARY:INTRADAY:";
    /**
     * 门店当月30天内订单汇总信息KEY
     */
    public static final String CACHE_KEY_STORE_ORDER_MONTH_SALESSUMMARY = "STORE:SALESSUMMARY:MONTH:";
    /**
     * 订单缓存
     */
    public static final String CACHE_ORDER_INFO_4_MANAGEMENT = "ORDER:INFO4MANAGEMENT:";
    /**
     * 订单号生成重复redis验证KEY
     */
    public static final String CACHE_KEY_ORDERNO_CHECK_EXISTS = "ORDERNO:CHECK:";
    /**
     * 用户确认订单防频繁操作
     */
    public static final String CACHE_KEY_CUSTOMER_ORDER_REPEAT = "CACHE_KEY_CUSTOMER_ORDER_REPEAT";
    /**
     * 用户加购物车防频繁操作
     */
    public static final String CACHE_KEY_CUSTOMER_SHOPCART_REPEAT = "CACHE_KEY_CUSTOMER_SHOPCART_REPEAT";
    /**
     * C端用户验证码key
     */
    public static final String CUSTOMER_USER_SEND_VERIFICATION_CODE = "CUSTOMER:USER:SEND:VERIFICATION:CODE:";
    /**
     * B端用户验证码key
     */
    public static final String STORE_USER_SEND_VERIFICATION_CODE = "STORE:USER:SEND:VERIFICATION:CODE:";
    /**
     * B端C端发送验证码请求key
     */
    public static final String SEND_VERIFICATION_CODE_REQUEST_TIME = "SEND:VERIFICATION:CODE:REQUEST:TIME:";
    /**
     * B端购买过商品sku key
     */
    public static final String STORE_BUYED_HXDPROD_SKU = "STORE:BUYED:HXDPROD:SKU:";
    /**
     * JSON模板文件缓存
     */
    public static final String JSON_TEMPLATES = "JSON_TEMPLATES:";

    /**
     * B端绑定银行卡存入验证码 key
     */
    public static final String PAY_VERIFICATION_CODE = "PAY:MOBILE:VERIFICATION:";

    /**
     * 小程序accesstoken
     */
    public static final String MESSAGE_MINI_ACCESS_TOKEN = "MINIPROGRAM:ACCESSTOKEN:";

    /**
     * B端发送短信 验证次数 key
     */
    public static final String MESSAGE_SMS_SEND_VERIFICATION_CODE = "MESSAGE:SMS:SEND:VERIFICATION:CODE:";

    /**
     * 事件消息ID,SortedSet
     */
    public static final String EVENT_MESSAGE_ID = "EVENT:MESSAGE:ID:";
    /**
     * 事件消息内容,Hash
     */
    public static final String EVENT_MESSAGE_BODY = "EVENT:MESSAGE:BODY:";
    /**
     * 事件消息处理去重
     */
    public static final String EVENT_MESSAGE_HANDLER = "EVENT:MESSAGE:HANDLER:";
    /**
     * 门店资金流转
     */
    public static final String BACKROLL_STORE = "BACKROLL:STORE";

    /**
     * 领取优惠券
     */
    public static final String RECEIVE_COUPON = "RECEIVE:COUPON";
    
    /**
     * 接口访问次数key
     */
    public static final String LIMIT_INTERFACE_ACCESS = "LIMIT:INTERFACE:ACCESS:";
    
    /**
     * 对账单下载防重复
     */
    public static final String DOWN_LOAD_STATEMENT = "DOWN:LOAD:STATEMENT:";
    
    /**
     * 资金账单下载防重复
     */
    public static final String DOWN_LOAD_BILL = "DOWN:LOAD:BILL:";
}
