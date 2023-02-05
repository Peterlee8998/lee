package com.peter.lee.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

/**
 * @Description
 * @Author tangpengxiang
 * @Date 2023/1/10 22:41
 */
@Data
@Setter
@Getter
@Builder
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

    String name;

    Integer age;

    Score score;
}
