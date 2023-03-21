package top.iserv.shareable;

import java.lang.reflect.Field;
import java.util.HashMap;

public abstract class AbstractRequest<T extends AbstractRequest<T>> {
    /**
     * 返回请求类对应的 API URI
     */
    public abstract String getApiUri();

    /**
     * 获取类请求参数
     */
    public HashMap<String, Object> getParams() throws IllegalAccessException {
        HashMap<String, Object> map = new HashMap<>();

        if (this.getClass().getSuperclass() != null) {
            for (Field field : this.getClass().getSuperclass().getDeclaredFields()) {
                field.setAccessible(true);
                map.put(field.getName(), field.get(this));
            }
        }

        for (Field field : this.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(this));
        }

        return map;
    }
}
