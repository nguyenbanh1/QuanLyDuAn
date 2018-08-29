package exeption;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "not found exeption")
public class DataNotFoundExeption extends RuntimeException {
    public DataNotFoundExeption(String message){
        super(message);
    }
}
