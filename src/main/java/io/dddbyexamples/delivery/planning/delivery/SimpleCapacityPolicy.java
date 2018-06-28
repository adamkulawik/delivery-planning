package io.dddbyexamples.delivery.planning.delivery;

import io.dddbyexamples.delivery.planning.Amounts;

public class SimpleCapacityPolicy implements CapacityPolicy {

    @Override
    public Amounts calculateExceeded(TransportType type, Amounts amounts) {
        long exceeded = Math.max(amounts.sum() - type.getCapacity(), 0);
        return Amounts.of("any", exceeded);
    }
}
