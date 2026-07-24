### HTML, CSS, JS 각각의 개념과 역할

- **HTML**
    - 웹 문서의 구조와 내용을 정의
    - DOM 구성

- **CSS**
    - DOM 요소의 스타일과 디자인을 편집

- **JS**
    - JavaScript
    - 이벤트 발생 시 DOM 을 동적으로 조작
    - 인터프리터 방식의 스크립트 언어

<aside>

💡 **DOM (Document Object Model Structure) ?**

웹 브라우저가 웹 페이지를 인식, 조작할 수 있도록 
HTML 문서를 **트리 형태**의 계층 구조로 변환 한 것

✨ **핵심 특징**

- 계층적 트리 구조
    - 모든 요소가 부모, 자식, 형제  관계
    - 가장 최상위 : document 객체
- 동적 제어 가능
    - 자바스크립트 등으로 동적 추가, 삭제, 수정 가능
- 실시간 반영
    - DOM 구조 변경 시, 웹 브라우저는 즉각적으로 반영하여 재노출

💭 **그래서…**

- 웹 표준 인터페이스를 제공 하는 역할
- 동적 웹사이트의 구현을 가능케 함
</aside>

```html
<!DOCTYPE html>
<html>
	<head>
		<title>이것이 DOM 구조</title>
	</head>
	<body>
		<p>계층적으로 나뉘어져 있음!</P>
	</body>
</html>
```

---

### Flex 와 Grid의 차이점

- **Flex**
    - 가로 혹은 세로의 **1차원 정렬**
    - 메뉴 바, 버튼 리스트, 균일 간격 카드 배치 등 방향이 고른 정렬 레이아웃이 핵심
    
    ```css
    /* 선언 */
    display: flex;
    
    /* 현재 축 기준 정렬 - 가운데 */
    justify-content: center;
    
    /* 교차 축 기준 정렬 - 가운데 */
    align-items: center;
    
    /* 가운데 외에도 flex-start, flex-end, space-between 등등 */
    
    /* 자동 줄바꿈 설정 */
    flex-wrap : wrap
    ```
    

- **Grid**
    - **행과 열**로 이루어진 **2차원 격자 정렬**
    - 바둑판 배열 형태로 직관적이고 구조화 된 페이지 분할
    - 대시보드, 갤러리, 규칙적으로 나뉘는 전체 웹 페이지 등의 레이아웃 설계에 유리
 
    ```css
    /* 선언 */
    display: grid;

    /* 정렬 - 1프레임 안에 4개 */
    grid-template-columns: minmax(4, 1fr);

    /* repeat 함수 이용 가능 - 1프레임 안에 4개, 
    가로축 크기에 맞춰 가능한 많은 행/열 생성*/
    grid-template-columns: repeat(auto-fit, minmax(4, 1fr)); 
    ```
