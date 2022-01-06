class Solution {
    val board = mutableListOf<CharArray>()
    val pa = 'A'
    val pb = 'B'
    var turn = pa
    val blank = '-'
    
    fun tictactoe(moves: Array<IntArray>): String {
        if (moves.size < 5) return "Pending"
        
        this.initBoard()
        
        for (move in moves) {
            this.board[move[0]][move[1]] = this.turn
            
            if (this.isWin()) return this.turn.toString()
            
            if (this.turn == pa) this.turn = pb
            else this.turn = pa
        }
        
        
        if (this.isDraw()) return "Draw"
        return "Pending"
    }
    
    fun initBoard() {
        for (i in 0..2) {
            board.add(CharArray(3))
            board[i][0] = this.blank
            board[i][1] = this.blank
            board[i][2] = this.blank
        }
    }
    
    fun print() {
        for (i in 0..2) {
            println(board[i])
        }
    }
    
    fun isDraw(): Boolean {
        for (i in 0..2) {
            for (j in 0..2) {
                if (this.board[i][j] == this.blank) return false
            }
        }
        return true
    }
    
    fun isWin(): Boolean {
        if (this.board[1][1] == this.turn) {
            if (this.board[0][0] == this.turn && this.board[2][2] == this.turn) return true
            if (this.board[0][2] == this.turn && this.board[2][0] == this.turn) return true
        }
        
        for (i in 0..2) {
            if (this.board[i][0] == this.turn && this.board[i][1] == this.turn && this.board[i][2] == this.turn) return true
            if (this.board[0][i] == this.turn && this.board[1][i] == this.turn && this.board[2][i] == this.turn) return true
        }
        
        return false
    }
}
