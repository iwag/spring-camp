package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisCache {
    @Autowired
    private StringRedisTemplate template;

    public void set(String key, String value) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        if (!this.template.hasKey(key)) {
            ops.set(key, value);
        }
    }

    public String get(String key) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        if (!this.template.hasKey(key)) {
            return ops.get(key);
        }

        return null;
    }
}
