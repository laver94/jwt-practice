package com.cos.jwt.config.jwt;

public interface JwtProperties {
  String SECRET = "cos"; // 우리 서버만 알고 있는 비밀값
  int EXPIRATION_TIME = 60000 * 100; //10분
  String TOKEN_PREFIX = "Bearer "; // 반드시 한 칸 띄어야 한다.
  String HEADER_STRING = "Authorization";
}
