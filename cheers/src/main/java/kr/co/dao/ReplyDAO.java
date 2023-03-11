package kr.co.dao;
import java.util.*;
import kr.co.vo.ReplyVO;

public interface ReplyDAO {

	//댓글 조회
		public List<ReplyVO> readReply(int b_num) throws Exception;
		
		//댓글 작성
		public void writeReply(ReplyVO vo) throws Exception;
		
		//첨부파일 업로드
		public void insertFile(Map<String, Object> map) throws Exception;
		
		//댓글 수정
		public void updateReply(ReplyVO vo) throws Exception;
		
		//댓글 삭제
		public void deleteReply(ReplyVO vo) throws Exception;
		
		//선택된 댓글 조회
		public ReplyVO selectReply(int r_num) throws Exception;
		
		//댓글 이미지 조회
		public List<Map<String, Object>> replyImage(int r_num) throws Exception;
}
