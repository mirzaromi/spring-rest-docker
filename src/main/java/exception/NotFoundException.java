package exception;

import enums.ResponseCode;
import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException {
    private final ResponseCode responseCode;
    public NotFoundException(ResponseCode responseCode) {
        super(responseCode.message());
        this.responseCode = responseCode;
    }
}
