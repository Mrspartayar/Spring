package springcore;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Hips don't lie";
    }
}
