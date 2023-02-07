package com.peter.lee.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.peter.lee.dao.UserRepository;
import com.peter.lee.model.LoginInfo;
import com.peter.lee.model.PaymentInfo;
import com.peter.lee.model.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: lee
 * @description: api测试接口
 * @author: Peter
 * @date: 2023/2/6 9:56
 **/
@RestController
@RequestMapping("api/v1/")
@Log4j2
public class UserRestController {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Autowired
    UserRepository userRepository;

    @GetMapping("test")
    public ResponseEntity test() {
        log.info("GET: /api/v1/test");
        return ResponseEntity.status(200).build();
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ResponseEntity persistUser(@RequestBody LoginInfo input) {
        log.info("^^^^^^^^^^^^ POST - /api/v1/login - body = {} ^^^^^^^^^^^^", input.toString());
        String user = input.getUser();
        String passwd = input.getPassword();
        ResponseEntity entity = findUser(user, passwd);
        return entity;
    }

    @RequestMapping(value = "login-query", method = RequestMethod.GET)
    public ResponseEntity persistUserFromQuery(@RequestParam(name = "user") String user, @RequestParam(name = "passwd") String passwd) {
        log.info("^^^^^^^^^^^^ GET - /api/v1/login-query - RequestParam: user={}, passwd={}", user, passwd);
        ResponseEntity entity = findUser(user, passwd);
        return entity;
    }

    @RequestMapping(value = "login-path/{user}/{passwd}/", method = RequestMethod.GET)
    public ResponseEntity persistUserFromPath(@PathVariable String user, @PathVariable String passwd) {
        log.info("^^^^^^^^^^^^ GET - /api/v1/login-path - PathParams: user={}, passwd={} ^^^^^^^^^^^^", user, passwd);
        ResponseEntity entity = findUser(user, passwd);
        return entity;
    }

    @RequestMapping(value = "filter/{list_param}/tag/", method = RequestMethod.GET)
    public ResponseEntity persistUserFromPath(@PathVariable String list_param) {
        log.info("^^^^^^^^^^^^ GET - /api/v1/filter/list_param/tag - PathParams: list_param={} ^^^^^^^^^^^^", list_param);
        return ResponseEntity.status(200).body(list_param);
    }

    @RequestMapping(value = "shop", method = RequestMethod.GET)
    public ResponseEntity goToShop() {
        log.info("^^^^^^^^ GET - /api/v1/shop ^^^^^^^^");
        return ResponseEntity.status(200).body("shop");
    }

    @RequestMapping(value = "shop/{itemId}/info/", method = RequestMethod.GET)
    public ResponseEntity getItemInfo(@PathVariable String itemId) {
        log.info("^^^^^^^^ GET - /api/v1/shop/itemId - PathParams: itemId={} ^^^^^^^^", itemId);
        return ResponseEntity.status(200).body(itemId);
    }

    @RequestMapping(value = "shop/cart/addItem", method = RequestMethod.GET)
    public ResponseEntity addItemToCart(@RequestParam(name = "itemId") String itemId, @RequestParam(name = "quantity") int quantity) {
        log.info("^^^^^^^^^^^^ GET - /api/v1/shop/cart/addItem - RequestParam: itemId={}, quantity={} ^^^^^^^^^^^^", itemId, quantity);
        return ResponseEntity.status(200).body(itemId);
    }

    @RequestMapping(value = "shop/cart/checkout", method = RequestMethod.POST)
    public ResponseEntity checkoutCart(@RequestBody PaymentInfo input) {
        log.info("^^^^^^^^ POST - /api/v1/checkout - body={} ^^^^^^^^", input.toString());
        return ResponseEntity.status(200).body(input);
    }

    private ResponseEntity<?> findUser(String user, String passwd) {
        try {
            List<User> results = userRepository.findByNameAndPasswd(user.split("_")[0], passwd.split("_")[0]);
            if (results != null && results.size() > 0) {
                log.info("User found" + results.get(0));
                return ResponseEntity.ok(results.get(0));
            }
        } catch (Exception e) {
            log.error("findUser " + e.getMessage());
        }
        return ResponseEntity.status(500).body(new User(-1L, user, passwd));
    }
}
