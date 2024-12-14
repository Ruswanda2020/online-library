package com.oneDev.onlinelibrary.entity;

import com.oneDev.onlinelibrary.entity.base.Base;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role extends Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 265, nullable = false)
    private String name;
}
