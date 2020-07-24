domain

- とりあえず仮の案
- コマ情報
- マッチング情報



usecase

- 対戦相手にコマ情報を送りたい
- 対戦相手にコマ情報を受け取りたい
- サーバーにマッチング情報を送りたい
- サーバーからマッチング情報を受け取りたい
- サーバーとコネクションを張りたい
- サーバーとコネクションを切りたい(ゲーム終了)



controller

- usecase の実装
- websocket に依存しないため interface を作成
- gin に依存しないため interface を作成



frameworks

- websocket interface の実装
- gin interface の実装