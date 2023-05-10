package io.lcalmsky.effectivejava.chapter01.item07.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ChannelTest {

    @Test
    void npe() {
        Channel channel = new Channel();
        MemberShip memberShip = channel.defaultMemberShip();
        assertThrows(NullPointerException.class, () -> memberShip.equals(new MemberShip()));
    }

    @Test
    void optional() {
        OptionalChannel channel = new OptionalChannel();
        Optional<MemberShip> memberShip = channel.defaultMemberShip();
        memberShip.ifPresent(MemberShip::hello);
    }
}