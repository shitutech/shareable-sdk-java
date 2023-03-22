package top.iserv.shareable;

import java.lang.reflect.Field;
import java.util.HashMap;

public abstract class AbstractRequest {
    /**
     * 返回请求类对应的 API URI
     */
    public abstract String getApiUri();
}
