## Python에서의 가변 객체와 불변 객체의 차이

#### 가변(Mutable) 객체

- 생성 후 내용 변경 가능
    - 값이 바뀌어도 **메모리 주소가 유지**
- 종류
    - list, dict, set, 직접 만든 클래스, …

#### 불변(Immutable) 객체

- 생성 후 내용 변경 불가능
    - 값이 바뀌면 **새로운 객체 생성**
    - **메모리 주소 변경**
- 종류
    - int, float, bool, sty, tuple, …

#### 주의점

- 가변 객체의 경우 외부 변수에 영향을 줌
    - list / int 로 예시
    - 5를 더해주는 함수
    - list
        
        ```python
        original = [1, 2]
        
        # 여기에 5를 더하는 함수 실행 시 // append(5)
        print(original)    # [1, 2, 5] 로 값 자체가 바뀐걸로 출력
        ```
        
    - int
        
        ```python
        original = 1
        
        # 여기에 5를 더하는 함수 실행 시 // num += original + 5
        print(original)    # 1 로, original은 변경되지 않음
        ```
        

---

## Pandas에서의 View와 Copy의 차이

#### View

- 원본과 메모리를 공유
    - 하나의 데이터
    - **view 수정 시 원본도 변경**
- 복사 과정이 불필요 하므로 처리 속도가 빠름

#### Copy

- 새로운 메모리 공간에 복제
    - 독립 된 메모리
    - **copy 수정 시 원본 유지**
- 복사 과정이 필요하여 상대적으로 처리 속도가 느림
