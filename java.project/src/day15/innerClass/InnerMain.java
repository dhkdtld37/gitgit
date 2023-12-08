package day15.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerMain { 		// 외부 클래스
	
	
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); 	// 프레임(화면)
		Button btn = new Button("Button - start"); 		// 기본적으로 영어만 사용 가능, 한글은 깨짐
		
		// 3.
		btn.addActionListener(new ActionListener() { 		// 익명(무명) 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생");
				System.err.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println();
			}
		}); 		// 버튼에 액션이벤트 추가
		
		frame.addWindowListener( new WindowAdapter() { 		// 닫기 버튼
				// lister는 인터페이스? 	adpater는 클래스 기반
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.add(btn); 	// 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
		
	}

}

/*
package day15.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain { 		// 외부 클래스
	
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); 	// 프레임(화면)
		Button btn = new Button("Button - start"); 		// 기본적으로 영어만 사용 가능, 한글은 깨짐
		
		// 2.
		btn.addActionListener(new ActionListener() { 		// 익명(무명) 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생");
				System.err.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println();
			}
		}); 		// 버튼에 액션이벤트 추가
		
		frame.add(btn); 	// 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
		
	}

}
*/

/*
package day15.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain { 		// 외부 클래스
	
	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent 발생");
			System.err.println(e.getActionCommand());
			System.out.println(e.getSource());
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); 	// 프레임(화면)
		Button btn = new Button("Button - start"); 		// 기본적으로 영어만 사용 가능, 한글은 깨짐
		
		// 1.
		EventHandler handler = new InnerMain().new EventHandler();
		btn.addActionListener(handler); 		// 버튼에 액션이벤트 추가
		
		frame.add(btn); 	// 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
		
	}

}
*/