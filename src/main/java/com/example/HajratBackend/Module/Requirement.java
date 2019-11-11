package com.example.HajratBackend.Module;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

enum Status {
    INCOMPLETE,
    ACKNOWLEDGED,
    ISSUED,
    COMPLETE
}

public class Requirement {

    UUID id;
    UUID workSiteId;
    String description;
    String imageUrl;
    String audioUrl;
    Date creationDate;
    Time creationTime;
    Time issueTime;
    Time completionTime;
    Status reqStatus;
}
