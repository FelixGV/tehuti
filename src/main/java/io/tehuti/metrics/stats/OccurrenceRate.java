package io.tehuti.metrics.stats;

import java.util.concurrent.TimeUnit;

/**
 * Utility class to create a {@link Rate} based on a {@link SampledCount}.
 */
public class OccurrenceRate extends Rate {
    public OccurrenceRate() {
        this(TimeUnit.SECONDS);
    }

    public OccurrenceRate(TimeUnit unit) {
        super(unit, new SampledCount());
    }
}