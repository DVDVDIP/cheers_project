package kr.co.dao;
import java.util.*;
import kr.co.vo.ReplyVO;

public interface ReplyDAO {

	//��� ��ȸ
		public List<ReplyVO> readReply(int b_num) throws Exception;
		
		//��� �ۼ�
		public void writeReply(ReplyVO vo) throws Exception;
		
		//÷������ ���ε�
		public void insertFile(Map<String, Object> map) throws Exception;
		
		//��� ����
		public void updateReply(ReplyVO vo) throws Exception;
		
		//��� ����
		public void deleteReply(ReplyVO vo) throws Exception;
		
		//���õ� ��� ��ȸ
		public ReplyVO selectReply(int r_num) throws Exception;
		
		//��� �̹��� ��ȸ
		public List<Map<String, Object>> replyImage(int r_num) throws Exception;
}
