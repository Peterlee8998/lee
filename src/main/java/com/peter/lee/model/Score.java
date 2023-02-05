package com.peter.lee.model;

import lombok.*;

/**
 * @Description
 * @Author tangpengxiang
 * @Date 2023/1/10 22:43
 */
@Data
@Setter
@Getter
@Builder
@ToString
public class Score {

    Integer chinese;

    Integer math;

    Integer english;
}
