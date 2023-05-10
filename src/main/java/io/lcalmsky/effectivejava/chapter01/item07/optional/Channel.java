package io.lcalmsky.effectivejava.chapter01.item07.optional;

public class Channel {
    private int numOfSubscribers;

    public MemberShip defaultMemberShip() {
        if (this.numOfSubscribers < 2000) {
            return null;
        }
        return new MemberShip();
    }
}
