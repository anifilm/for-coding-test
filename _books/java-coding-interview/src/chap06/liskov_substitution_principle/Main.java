package chap06.liskov_substitution_principle;

import chap06.liskov_substitution_principle.bad.Member;
import chap06.liskov_substitution_principle.good.TournamentJoiner;
import chap06.liskov_substitution_principle.good.TournamentOrganizer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Approach that doesn't follow LSP:\n");

        List<Member> members1 = List.of(
                new chap06.liskov_substitution_principle.bad.PremiumMember("Jack Hores"),
                new chap06.liskov_substitution_principle.bad.VipMember("Tom Johns"),
                new chap06.liskov_substitution_principle.bad.FreeMember("Martin Vilop"));

        // 이 코드는 리스코프 치환 원칙을 준수합니다.
        for (Member member : members1) {
            member.joinTournament();
        }

        System.out.println();

        // 이 코드는 리스코프 치환 원칙에 맞지 않습니다. 무료 회원은 토너먼트를 주최할 수 없습니다.
        for (Member member : members1) {
            member.organizeTournament();
        }

        System.out.println("\nApproach that follow LSP:\n");

        List<TournamentJoiner> members2 = List.of(
                new chap06.liskov_substitution_principle.good.PremiumMember("Jack Hores"),
                new chap06.liskov_substitution_principle.good.VipMember("Tom Johns"),
                new chap06.liskov_substitution_principle.good.FreeMember("Martin Vilop"));

        List<TournamentOrganizer> members3 = List.of(
                new chap06.liskov_substitution_principle.good.PremiumMember("Jack Hores"),
                new chap06.liskov_substitution_principle.good.VipMember("Tom Johns"));

        // 이 코드는 리스코프 치환 원칙을 준수합니다.
        for (TournamentJoiner member : members2) {
            member.joinTournament();
        }

        System.out.println();

        // 이 코드는 리스코프 치환 원칙을 준수합니다.
        for (TournamentOrganizer member : members3) {
            member.organizeTournament();
        }
    }
}
