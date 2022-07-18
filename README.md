### 기능

1. 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다. - view
2. 좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
   - [x] 괄호의 좌표정보를 구분 할 수 있다(x, y로 나뉨). -> findPoint()
     
3. 각 값은 원시값으로 포장한다.
    - [x] X, Y좌표 모두 최대 24까지만 입력할 수 있다. 
    - [x] 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
5. 정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다. - view
6. 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
   - [x] '-'로 좌표값 섹션을 구분할 수 있다. -> findSection()
7. 직선인 경우는 두 점 사이 거리를 계산해서 출력한다.
    - [ ] 두 점사이를 계산 할 수 있다.
    
### ERD

board
point
points