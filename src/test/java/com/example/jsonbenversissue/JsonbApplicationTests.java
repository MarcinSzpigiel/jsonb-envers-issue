package com.example.jsonbenversissue;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JsonbApplicationTests {

    @Autowired
    AuditedRepository auditedRepository;

    @Autowired
    NotAuditedRepository notAuditedRepository;

    @Autowired
    ObjectMapper objectMapper;

    private static final String JSON = """
            {
              "example": "Data"
            }
        """;

    @Test
    void auditedTest() {

        var auditedTable = new AuditedTable();
        auditedTable.setPayload(JSON);

        var saved = auditedRepository.save(auditedTable);

        Assertions.assertThat(saved).isNotNull();
        Assertions.assertThat(saved.getPayload()).isEqualTo(JSON);

    }

    @Test
    void notAuditedTest() {

        var notAuditedTable = new NotAuditedTable();
        notAuditedTable.setPayload(JSON);

        var saved = notAuditedRepository.save(notAuditedTable);

        Assertions.assertThat(saved).isNotNull();
        Assertions.assertThat(saved.getPayload()).isEqualTo(JSON);

    }

}
