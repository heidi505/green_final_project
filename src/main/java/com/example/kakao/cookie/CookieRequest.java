package com.example.kakao.cookie;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class CookieRequest {
    

    @Getter
    @Setter
    @ToString
    public static class paymentReqDTO  {

        private int cookieAmount;
        private int userId;
    }
}
