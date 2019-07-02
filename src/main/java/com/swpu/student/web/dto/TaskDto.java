package com.swpu.student.web.dto;

import org.apache.ibatis.type.Alias;

/**
 * Description: student
 * Created by Zhu Peng on 2019/7/2
 */
@Alias("TaskDto")
public class TaskDto {
    private long id;
    private String taskName;
    private String taskType;
    private String taskEndDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskEndDate() {
        return taskEndDate;
    }

    public void setTaskEndDate(String taskEndDate) {
        this.taskEndDate = taskEndDate;
    }
}
