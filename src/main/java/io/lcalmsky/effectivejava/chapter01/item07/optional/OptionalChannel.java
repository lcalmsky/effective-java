package io.lcalmsky.effectivejava.chapter01.item07.optional;

import java.util.Optional;

public class OptionalChannel {

    private int numOfSubscribers;

    public Optional<MemberShip> defaultMemberShip() {
        if (this.numOfSubscribers < 2000) {
            return Optional.empty();
        }
        return Optional.of(new MemberShip());
    }
}
