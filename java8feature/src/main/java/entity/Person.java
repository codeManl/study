package entity;

import lombok.*;

/**
 * Person实体类
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Person {

    @NonNull
    private String name; // 姓名
    @NonNull
    private int salary; // 薪资

    private int age; // 年龄
    @NonNull
    private String sex; //性别
    @NonNull
    private String area; // 地区
}
