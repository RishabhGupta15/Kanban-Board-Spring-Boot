package com.kanbanboard.project;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "PROJECTS")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "PID")
    private String pID;
    @Column(name = "PROJECT_NAME")
    private String projectName;
    @Column(name = "PROJECT_DESCRIPTION")
    private String projectDescription;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "END_DATE")
    private Date endDate;
}
