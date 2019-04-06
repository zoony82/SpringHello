package juns.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Book extends AbstractPersistable<Long> {
    private String name;
    private String attr1;
    private String attr2;
}
