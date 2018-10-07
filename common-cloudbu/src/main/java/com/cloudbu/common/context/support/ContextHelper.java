package com.cloudbu.common.context.support;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.cloudbu.common.util.JsonUtil;

public class ContextHelper {
    public static final String UTF_8 = "UTF-8";

    public static final String HEADER_USER_CUSTOMER = "b2c-user-customer";
    public static final String HEADER_USER_STORE = "b2c-user-store";
    public static final String HEADER_USER_ADMIN = "b2c-user-admin";

    public static final String TRACER_API_CODE = "api.code";
    public static final String TRACER_API_TOKEN = "api.token";
    public static final String TRACER_API_GRP = "api.grp";
    public static final String TRACER_API_USER = "api.user";
    public static final String TRACER_API_STORE = "api.store";
    public static final String TRACER_API_CUSTOMER = "api.customer";
    public static final String TRACER_API_REQUEST = "api.request";
    public static final String TRACER_API_RESPONSE = "api.response";
    public static final String TRACER_API_RESULT = "api.result";
    public static final String TRACER_API_ERROR = "api.error";
    public static final String TRACER_API_TRACE_ID = "API-TRACE-ID";

    public static final String PATH_TAG_SECURITY = "/security";
    public static final String PATH_TAG_COOPERATION = "/openapi";

    public static final Pattern PATTERN_SERVICE_PATH = Pattern.compile("^/([a-zA-Z]+)/(\\d{3,4})/v\\d+/\\w+.*");
    public static final Pattern PATTERN_API_PATH = Pattern.compile("^/api-[a-zA-Z]+/([a-zA-Z]+)(/security|/openapi)?/(\\d{3,4})/v\\d+/\\w+.*");

    public static <T> T getHeaderObject(HttpServletRequest request, String headerName, Class<T> clazz) {
        String header = request.getHeader(headerName);
        if (StringUtils.isBlank(header)) {
            return null;
        }
        try {
            String json = URLDecoder.decode(header, UTF_8);
            return getHeaderObject(json, clazz);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static <T> T getHeaderObject(String json, Class<T> clazz) {
        return JsonUtil.parseJSONObject(json, clazz);
    }


    public static String getHeaderJsonString(Object obj) {
        String json = JsonUtil.toJSONString(obj);
        return encode(json);
    }

    public static String encode(String json) {
        try {
            return URLEncoder.encode(json, UTF_8);
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
}
