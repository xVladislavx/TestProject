import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

public class YandexTest {

    @Test
    @Description("asdasd")
    public void test(){
        Selenide.open("http://yandex.ru");
    }
}
