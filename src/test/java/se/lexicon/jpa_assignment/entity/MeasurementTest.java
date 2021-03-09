package se.lexicon.jpa_assignment.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MeasurementTest {
    Measurement testObject;

    @BeforeEach
    public void setup() {
        testObject = Measurement.HG;
    }
    @Test
    @DisplayName("Test Create Object")
    public void test_sucessfully_created() {
        Assertions.assertEquals(3,testObject.getValue());
    }




}
