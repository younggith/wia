package com.younggi.wia.service;

import com.younggi.wia.dto.Member;
import java.util.List;
import java.util.Optional;
public interface MemberService {

    public Long join(Member member);
    public void validateDuplicateMember(Member member);
    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers();
    public Optional<Member> findOne(Long memberId);
}
