package com.bdea.grp2.lambda.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "file")
public class File {
    @Id
    private String filename;
    private long wordCount;

}
