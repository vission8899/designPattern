package com.vission.structural.flyweight.domain;

import com.vission.structural.flyweight.enums.ColorEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cat {

    private ColorEnum color;

}
