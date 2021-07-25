package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;
import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "memver_id")
    private Long id;

    private String username;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

}
