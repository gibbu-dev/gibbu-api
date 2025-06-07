package kr.gibbu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/test")
  public String test() {
    return "ci test success";
  }

  @GetMapping("/hello")
  public String hello() {
    return "hello gibbu";
  }

  @GetMapping("/tmp")
  public String tmp() {
    return "tmp";
  }
}