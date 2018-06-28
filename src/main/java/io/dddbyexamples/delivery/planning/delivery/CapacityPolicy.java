package io.dddbyexamples.delivery.planning.delivery;

import io.dddbyexamples.delivery.planning.Amounts;

public interface CapacityPolicy {

    Amounts calculateExceeded(TransportType type, Amounts amounts);

}
